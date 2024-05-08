package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Report;
import repo.ReportRepo;

import java.util.List;

@Service
public class ReportService
{
    private final ReportRepo reportRepo;
    @Autowired
    public ReportService(ReportRepo reportRepo)
    {
        this.reportRepo = reportRepo;
    }
    public List<Report> getAllReports()
    {
        return reportRepo.findAll();
    }

    public Report getReportById(ObjectId id)
    {
        return reportRepo.findById(id).orElse(null);
    }

    public void saveReport(Report report)
    {
        reportRepo.save(report);
    }

    public void deleteReport(ObjectId id)
    {
        reportRepo.deleteById(id);
    }
}
