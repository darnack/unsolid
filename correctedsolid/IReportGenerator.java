package com.example.demo.unsolid;

public interface IReportGenerator {

    void generateReport(ReportOperations reportOperations);
	
	void saveToFile(String name);
}
