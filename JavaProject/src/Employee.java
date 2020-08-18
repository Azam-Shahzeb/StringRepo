

	public class Employee {		
		private int employeeID;
		private String firstName,lastName;
		private int basicSalary,totalSalary;
		 
		public Employee()
		{
			super();
		}
		
		
		public Employee(int employeeID, String firstName, String lastName) {
			super();
			this.employeeID = employeeID;
			this.firstName = firstName;
			this.lastName = lastName;
		}



		public Employee(int employeeID, String firstName, String lastName, int basicSalary, int totalSalary) {
			super();
			this.employeeID = employeeID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.basicSalary = basicSalary;
			this.totalSalary = totalSalary;
		}
	}

