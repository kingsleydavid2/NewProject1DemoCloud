package Demo12;

public class Excel1 {
	
	  public static vcxoid main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlywait(30, TimeUnit.SECONDS);
		
		//Locate the table
		WebElement table = driver.findElementbyClassName("tsc_tablename_12");
		
		//Print number of rows
		System.out.println("No of rows "+ table.findElements(By.tagName("tr")).size());
		
		//Print number of columns
		System.out.println("No of columns "+ table.findElement(By.tagName("thread")).findElements(By.tagName("th")).size());
		
		//Print contents of first column
		WebElement firstrow = table.findElement(By.tagName("tbody"))
		.findElements(By.tagName("tr"))
		.get(0);
		
		
		List<WebElement> firstRowContent = firstRow.findElements(By.tagName("td"));
		
		for(WebElement cell: firstRowContent) {
			System.out.println(cell.getText());
		}
		
		
		
		
		
	}
	

}
