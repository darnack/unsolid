package com.example.demo.unsolid;

public class GenerateReportPDF implements IReportGenerator  {

    public void generateReport(ReportOperations reportOperations) {
		  System.out.println("Generando reporte en PDF...");
    }
	
	public void saveToFile(String name)	{
		System.out.println("Almacenando reporte PDF...");
	}
}
