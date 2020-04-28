/* 
 * This test file is monitored by Jenkins for changes.
 * It will run for each commit
 * Job name: Test_BasicJenkinsJavaCompileAndRun
 */

public class HelloTest{
	
	public static void main(String[] args){
		
		for(int i=1;i<10;i++){
				
				System.out.println("Hello World..."+i);		//Will print for each loop

		}
	}
}