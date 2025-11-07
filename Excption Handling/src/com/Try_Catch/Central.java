package com.Try_Catch;

import java.util.Scanner;

class marksnotMatch extends Exception {

}

class UPSC {
	int cutoff_marks = 730;
	int scored_marks;

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks you scored");
		scored_marks = scan.nextInt();
	}

	void validate() throws marksnotMatch {
		if ( scored_marks>=cutoff_marks ) {
			System.out.println("you are eligible attending Mains exam.");
		} else {// because here faulty input can give that why here ducking an excption
			throw new marksnotMatch();
		}
	}

}

class CSE{
	void check() {
		UPSC upsc=new UPSC();
		try {
			upsc.input();
			upsc.validate();
		}
		catch (Exception e1) {
			try {
				upsc.input();
				upsc.validate();
			}
			catch (Exception e2) {
				try {
					upsc.input();
					upsc.validate();
				}
				catch (Exception e3) {
					try {
						upsc.input();
						upsc.validate();
					}
					catch (Exception e4) {
						try {
							upsc.input();
							upsc.validate();
						}
						catch (Exception e5) {
							try {
								upsc.input();
								upsc.validate();
							}
							catch (Exception e6) {
								try {
									upsc.input();
									upsc.validate();
								}
								catch (Exception e7) {
									try {
										upsc.input();
										upsc.validate();
									}
									catch (Exception e8) {
									System.out.println("Maximum attempt reached you can't attempt.");
										
									}
								}
							}
						}
				}
				}
			}
		}
	}
}
				
				
public  class Central {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSE cse=new CSE();
		cse.check();
	}

}
