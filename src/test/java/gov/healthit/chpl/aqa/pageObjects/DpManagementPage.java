package gov.healthit.chpl.aqa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class DpManagementPage definition.
 */
public class DpManagementPage {
    private static WebElement element = null;

    /**
     * Returns choose file button for new listing upload.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement chooseFileButton(final WebDriver driver) {
        element = driver.findElement(By.id("listing-file-upload"));
        return element;
    }

    /**
     * Returns choose file button for bulk surveillance upload.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement chooseFileForSurveillanceUploadButton(final WebDriver driver) {
        element = driver.findElement(By.id("surveillance-file-upload"));
        return element;
    }

    /**
     * Get the CHPL Product Number value in surveillance search results.
     * @param driver WebDriver
     * @return the CHPL Product Number element
     * returns null if element was not found
     */
    public static WebElement chplProductNumber(final WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/div/div/div[3]/table/tbody/tr[1]/td"));
        return element;
    }

    /**
     * Returns Confirm Pending Products link.
     * @param driver WebDriver
     * @return link element
     */
    public static WebElement confirmPendingProductsLink(final WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"admin-nav.dpManagement.confirm\"]/a"));
        return element;
    }

    /**
     * Returns true iff "Developer New" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isDeveloperNewDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("developer-new")).size() > 0;
    }

    /**
     * Returns true iff "Developer System" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isDeveloperSystemDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("developer-system")).size() > 0;
    }

    /**
     * Returns true iff "Developer Uploaded" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isDeveloperUploadedDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("developer-uploaded")).size() > 0;
    }

    /**
     * Returns true iff "Product New" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isProductNewDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("product-new")).size() > 0;
    }

    /**
     * Returns true iff "Product System" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isProductSystemDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("product-system")).size() > 0;
    }

    /**
     * Returns true iff "Product Uploaded" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isProductUploadedDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("product-uploaded")).size() > 0;
    }

    /**
     * Returns true iff "Version New" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isVersionNewDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("version-new")).size() > 0;
    }

    /**
     * Returns true iff "Version System" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isVersionSystemDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("version-system")).size() > 0;
    }

    /**
     * Returns true iff "Version Uploaded" DIV exists on the Inspect screen.
     * @param driver WebDriver
     * @return true iff element exists
     */
    public static boolean isVersionUploadedDivElementPresent(final WebDriver driver) {
        return driver.findElements(By.id("version-uploaded")).size() > 0;
    }

    /**
     * Returns 'Create new product' radio button element on Inspect screen.
     * @param driver WebDriver
     * @return radio button element
     */
    public static WebElement createNewProductOptionOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("create-product"));
        return element;
    }

    /**
     * Returns 'Create new version' radio button element on Inspect screen.
     * @param driver WebDriver
     * @return radio button element
     */
    public static WebElement createNewVersionOptionOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("create-version"));
        return element;
    }

    /**
     * Returns Developer and Product Management link.
     * @param driver WebDriver
     * @return link element
     */
    public static WebElement dpManagementLink(final WebDriver driver) {
        element = driver.findElement(By.linkText("Developer & Product Management"));
        return element;
    }

    /**
     * Returns element holding main content.
     * @param driver WebDriver
     * @return element holding main content
     */
    public static WebElement mainContent(final WebDriver driver) {
        element = driver.findElement(By.id("main-content"));
        return element;
    }

    /**
     * Returns Manage Surveillance Activity link.
     * @param driver WebDriver
     * @return link element
     */
    public static WebElement manageSurveillanceActivityLink(final WebDriver driver) {
        element = driver.findElement(By.linkText("Manage Surveillance Activity"));
        return element;
    }

    /**
     * Returns Pending Listings table in Confirm Pending Listings section.
     * @param driver WebDriver
     * @return table element
     */
    public static WebElement pendingListingsTable(final WebDriver driver) {
        element = driver.findElement(By.id("pending-listings-table"));
        return element;
    }

    /**
     * Returns 'previous' button on Inspect screen to navigate to previous screen.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement previousButtonOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("inspect-previous"));
        return element;
    }

    /**
     * Returns surveillanceSearch input box.
     * @param driver WebDriver
     * @return surveillanceSearch element
     */
    public static WebElement surveillanceSearch(final WebDriver driver) {
        element = driver.findElement(By.id("surveillance-search"));
        return element;
    }

    /**
     * Returns Surveillance search button.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement survSearchButton(final WebDriver driver) {
        element = driver.findElement(By.id("surveillance-search-button"));
        return element;
    }

    /**
     * Returns element that holds post upload success text.
     * @param driver WebDriver
     * @return text element
     */
    public static WebElement updateSuccessfulToastContainerText(final WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div[1]"));
        return element;
    }

    /**
     * Returns upload listing file button element.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement uploadFileButton(final WebDriver driver) {
        element = driver.findElement(By.id("listing-file-confirm-0"));
        return element;
    }

    /**
     * Returns upload surveillance file button element for bulk surveillance upload.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement uploadSurveillanceFileButton(final WebDriver driver) {
        element = driver.findElement(By.id("surveillance-file-confirm-0"));
        return element;
    }

    /**
     * Returns element that holds text message displayed after successful listing upload.
     * @param driver WebDriver
     * @return text element
     */
    public static WebElement uploadSuccessfulText(final WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/div/div[1]/div"));
        return element;
    }

    /**
     * Returns Upload Products and Surveillance link.
     * @param driver WebDriver
     * @return link element
     */
    public static WebElement uploadProductsAndSurveillanceLink(final WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"admin-nav.dpManagement.upload\"]/a"));
        return element;
    }

    /**
     * Returns 'next' button on Inspect screen to navigate to next screen.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement nextOnInspectButton(final WebDriver driver) {
        element = driver.findElement(By.id("inspect-next"));
        return element;
    }

    /**
     * Returns 'confirm' button on Inspect screen.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement confirmButtonOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("inspect-confirm"));
        return element;
    }

    /**
     * Returns edit certified product button on Inspect screen.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement editOnInspectButton(final WebDriver driver) {
        element = driver.findElement(By.id("inspect-edit"));
        return element;
    }

    /**
     * Returns product Id in CHPL ID on inspect form.
     * @param driver WebDriver
     * @return text element
     */
    public static WebElement productIdOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("id-prod"));
        return element;
    }

    /**
     * Returns product version in CHPL ID on inspect form.
     * @param driver WebDriver
     * @return text element
     */
    public static WebElement productVersionOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("id-ver"));
        return element;
    }

    /**
     * Returns save certified product button on inspect form.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement saveCpOnInspect(final WebDriver driver) {
        element = driver.findElement(By.id("edit-save"));
        return element;
    }

    /**
     * Returns 'Yes' button on Confirm alert.
     * @param driver WebDriver
     * @return button element
     */
    public static WebElement yesOnConfirm(final WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]"));
        return element;
    }

}
