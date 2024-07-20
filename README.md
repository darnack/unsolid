Actividad SOLID

Integrantes:
- Cristian Quesada Cossio
- Daniel Santiago Melo Suarez
- Elkin Eduardo Lesmes Vallejo
- Yesid Giovanny Sanabria Orjuela
- Fredy Alberto Gomez Ramirez

Violaciones de SOLID identificadas
- La clase SalaryCalculator viola el principio de Inversión de dependencias,
  ya que debería depender de la abstracción EmployeeOperations, en lugar de depender de la implementación EmployeeManager.
- La clase ReportGenerator viola el principio open/close.
  Debe implementar las diferentes estrategias de generación del reporte en clases independientes,
  y se debe definir la abstracción correspondiente del método generateReport.
- La clase ReportGenerato También viola el principio de Inversión de dependencias,
  ya que debería depender de la abstracción EmployeeOperations, en lugar de depender de la implementación EmployeeManager 
 
