//Graded Assessment - 1-1


class SuperDepartment{
	
	String departmentName() {
		return "Super Department";
	}
	
	String getTodaysWork() {
		return " No Work as of now";
	}
	
	String getWorkDeadline() {
		return "Nil";
	}
	
	String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}


class AdminDepartment extends SuperDepartment{
	
	String departmentName() {
		return "Admin Department"; 
	}
	
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}

}


class HrDepartment extends SuperDepartment{
	

	String departmentName() {
		return "Hr Department";
	}
	
	String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String doActivity() {
		return "team Lunch";
	}

}


class  TechDepartment extends SuperDepartment{

	String departmentName() {
		return "Tech Department";
	}
	
	String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	
	String getTechStackInformation() {
		return "core Java";
	}


}


public class Driver {

	public static void main(String[] args) {
		
		AdminDepartment ad = new AdminDepartment();
		System.out.print("Welcome to " +ad.departmentName() +"\n" +ad.getTodaysWork() +"\n" 
		+ad.getWorkDeadline() + "\n" +ad.isTodayAHoliday() +"\n\n\n\n");
		
		HrDepartment hd = new HrDepartment();
		System.out.print("Welcome to " +hd.departmentName() +"\n" +hd.getTodaysWork() +"\n" 
		+hd.getWorkDeadline() + "\n" +hd.isTodayAHoliday() +"\n\n\n\n");
		
		
		TechDepartment td = new TechDepartment();
		System.out.print("Welcome to " +td.departmentName() +"\n" +td.getTodaysWork() +"\n" 
		+td.getWorkDeadline() + "\n" +td.isTodayAHoliday() +"\n\n\n\n");
		
	}

}
