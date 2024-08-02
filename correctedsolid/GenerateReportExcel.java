package com.example.demo.unsolid;

public class GenerateReportExcel implements IReportGenerator  {

    public void generateReport(ReportOperations reportOperations) {
		  System.out.println("Generando reporte en Excel...");
    }
	
	public void saveToFile(String name)	{
		System.out.println("Almacenando reporte Excel...");
	}
}
