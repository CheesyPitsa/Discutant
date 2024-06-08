package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Report;
import pojo.User;
import service.ReportService;
import service.UserService;

import java.util.List;


@RestController
public class ReportsController
{
    private final ReportService reportService;
    private final UserService userService;

    @Autowired
    public ReportsController(ReportService reportService, UserService userService)
    {
        this.reportService = reportService;
        this.userService = userService;
    }

    @PostMapping("/reports")
    public List<Report> postReports()
    {
        return reportService.getAllReports();
    }

    @PostMapping("/reports/{user_nickname}")
    public List<Report> postReportsByUser(@PathVariable String user_nickname)
    {
        User user = userService.findProfileByNickname(user_nickname);
        return reportService.findReportByAuthor(user);
    }

    @PostMapping("/reports/reported/{user_nickname}")
    public List<Report> postReportsByReported(@PathVariable String user_nickname)
    {
        User user = userService.findProfileByNickname(user_nickname);
        return reportService.findReportByAuthor(user);
    }
}
