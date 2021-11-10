package initialization;

public class PickBrowser {

	public PickBrowser() {
		System.out.println("PickBrowser CONSTRUCTOR");

	}

	// Chrome
	public void ChromeBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//akaur//OneDrive - IDC//Desktop//My IDC//Automation Scripts//chromedriver_win32//chromedriver.exe");
	}

	// Edge
	public void EdgeBrowserLaunch() {
		// set path to Edge.exe
		System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");
	}

	// Firefox
	public void FrieFoxBrowserLaunch() {

	}

}
