package com.Try_Catch;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		 super("Invalid Age: Age must be between 18 and 60.");
	}
}

class InvalidDocumentException extends Exception {
	 public InvalidDocumentException() {
	        super(" Document Error: Aadhaar card is required.");
	    }
}

class InvalidVehicleTypeException extends Exception {
	 public InvalidVehicleTypeException() {
	        super(" Invalid Vehicle Type: Enter Two Wheeler or Four Wheeler.");
	    }
}

class FailedTestException extends Exception {
	 public FailedTestException(String test) {
	        super("❌ Failed " + test + " Test.");
	    }
}

class IncompleteFeeException extends Exception{
	public IncompleteFeeException() {
        super(" Fee Error: Pay full fees (500 for two wheeler, 1000 for four wheeler).");
    }
}

class Applicant {
	String name;
	int age;
	String vechileType;
	boolean hasAddhar;
	int writtenTestScore;
	int drivingTestScore;
	double fessPaid;

	void inputDetails() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name");
		name = scan.nextLine();

		System.out.println("Enter your age");
		age = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter you want two wheeler or Four Wheeler");
		vechileType = scan.nextLine();

		System.out.println("you have addhar true or false");
		hasAddhar = scan.nextBoolean();

		System.out.println("Enter you Written Test Score");
		writtenTestScore = scan.nextInt();

		System.out.println("Enter your driving Test Score");
		drivingTestScore = scan.nextInt();

		System.out.println("pay fess for two wheller 500 or four wheller 1000");
		fessPaid = scan.nextDouble();
		
	

	}

	void validateAge() throws InvalidAgeException {
		if (age < 18 || age >60) {
			throw new InvalidAgeException();
		}
	}

	void validateDocuments() throws InvalidDocumentException {
		if (!hasAddhar) {
			throw new InvalidDocumentException();
		}
	}

	void validateVehicleType() throws InvalidVehicleTypeException {
		if (!vechileType.equalsIgnoreCase("Two Wheeler") && !vechileType.equalsIgnoreCase("Four Wheeler")) {
			throw new InvalidVehicleTypeException();
		}
	}
	void validateFee() throws IncompleteFeeException{
		if(vechileType.equalsIgnoreCase("Two wheeler") && fessPaid <500) {
			throw new IncompleteFeeException();
		}
		 if(vechileType.equalsIgnoreCase("Four Wheeler") && fessPaid < 1000) {
		        throw new IncompleteFeeException();
		    }
	}

	void validateWrittenTest() throws FailedTestException {
		if (writtenTestScore < 60) {
			throw new FailedTestException("Written");
		}
	}

	void validateDrivingTest() throws FailedTestException {
		if (drivingTestScore < 70) {
			throw new FailedTestException("Driving");
		}
	}

}

class RTO {
	void processApplication() {
		Applicant appl = new Applicant();
		try {
			appl.inputDetails();
			appl.validateAge();
			appl.validateDocuments();
			appl.validateVehicleType();
			appl.validateWrittenTest();
			appl.validateDrivingTest();
			appl.validateFee();

			System.out.println("License Approved");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			try {
				System.out.println("2nd attempt ");
				appl.inputDetails();
				appl.validateAge();
				appl.validateDocuments();
				appl.validateVehicleType();
				appl.validateWrittenTest();
				appl.validateDrivingTest();
				appl.validateFee();

				System.out.println("License Approved");
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				try {
					System.out.println("3rd attempt ");
					appl.inputDetails();
					appl.validateAge();
					appl.validateDocuments();
					appl.validateVehicleType();
					appl.validateWrittenTest();
					appl.validateDrivingTest();
					appl.validateFee();

					System.out.println("License Approved");
				} catch (Exception e3) {
					System.out.println(e3.getMessage());
					System.out.println("Application Rejected");
				}
			}
		}
	}
}

public class RTO_Driving_License_Application_System {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.processApplication();
	}

}
