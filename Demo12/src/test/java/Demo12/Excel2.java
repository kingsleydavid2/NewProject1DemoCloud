package Demo12;

public class Excel2 {
	
	public static void main(String[] args) {
		
	System.setProperty("WebDriver.driver.chrome", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com/webtable/structure");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlywait(30,TimeUnit.SECONDS);
	
	System.setProperty("WebDriver.driver.chrome", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://wwww.google.com/webtable/demo1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlywait(30, TimeUnit.SECONDS);
	
	//Locate the table
	WebElement table = driver.findElementByClassName("tsc_tname");
	
	//Print no of rows
	System.out.println("Print no of rows "+ table.findElements(By.tagName("tname")).size());
	
	
	//Print no of columns
	System.out.println("Print no of columns "+ table.findElement(By.tagName("tr")).findElements(By.tagName(("td")).size();
	
		
	//Print contents of first columns
	WebElement firstrow = table.findElement(By.tagName("tdr")).findElements(By.tagName("thead")).get(0);
	
	List<WebElement> firstRowContent = firstrow.findElements(By.tagName("tgr"));
	
	for(WebElement cell:firstRowContent) {
		System.out.println(cell.getText());
	}
	
	
		
		
		
	}
	

}
