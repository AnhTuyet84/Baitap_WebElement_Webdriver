package Practice_Locators;

public class LocatorsCRM {
    public static void main(String[] args) {
     //xpath của trang Login
        String header = "//h1[normalize-space()='Login']";
        String email = "//input[@id='email']";
        String password = "//input[@id='password']";
        String remember = "//input[@id='remember']";
        String loginButton = "//button[normalize-space()='Login']";
        String forgotPass = "//a[normalize-space()='Forgot Password?']";
     //xpath của menu Customer
        String menuCustomer = "//span[normalize-space()='Customers']";
     //xpath của New Customer
        String newCustButton = "//a[normalize-space()='New Customer']";
        String custDetailsTab = "//a[normalize-space()='Customer Details']";
        String company = "//input[@id='company']";
        String vat = "//input[contains(@id,'vat')]";
        String phoneNumber = "//input[contains(@id,'phonenumber')]";
        String website = "//input[contains(@id,'website')]";
        String groups = "(//div[normalize-space()='Nothing selected'])[1]";
        String currency = "//button[@data-id='default_currency']";
        String defaultLanguage = "//button[@data-id='default_language']";
        String address = "//textarea[@id='address']";
        String city = "//input[@id='city']";
        String state = "//input[@id='state']";
        String zip = "//input[@id='zip']";
        String country = "//button[@data-id='country']";

        String BillShipTab = "//a[normalize-space()='Billing & Shipping']";
        String billingStreet = "//textarea[@id='billing_street']";
        String billingcity = "//input[@id='billing_city']";
        String billingstate = "//input[@id='billing_state']";
        String billingzip = "//input[@id='billing_zip']";
        String billingcountry = "//button[@data-id='billing_country']";

        String shippingStreet = "//textarea[contains(@id,'shipping_street')]";
        String shippingcity = "//input[contains(@id,'shippingzip_city')";
        String shippingstate = "//input[contains(@id,'shipping_state')]";
        String shippingzip = "//input[contains(@id,'shipping_zip')]";
        String shippingcountry = "//button[@data-id='shipping_country']";

        String saveCreate = "//button[starts-with(normalize-space(),'Save and')]";
        String save = "(//button[normalize-space()='Save'])[2]";

      //xpath của menu Projects
        String menuProjects = "//li[@class='menu-item-projects']/descendant::span";

      //xpath của New Projects
        String newProject = "//a[@data-title='Gantt']/preceding-sibling::a";
        String projectTab = "(//div[@class='horizontal-tabs']/descendant::a)[1]";
        String projName = "(//label[@class='control-label']/following-sibling::input)[1]";
        String projCust = "//select[@id='clientid']/following-sibling::button";
        String projHour = "(//div[@class='filter-option']/parent::button)[2]";
        String status = "//div[normalize-space()='In Progress']/ancestor::button";
        String projRateHour = "//div[@id='project_rate_per_hour']//input";
        String estimatedHour = "//div[@app-field-wrapper='estimated_hours']/child::input";
        String members = "//div[normalize-space()='Admin Example']/ancestor::button";
        String startDate = "(//div[@class='input-group date']/child::div)[1]";
        String deadline = "(//div[@class='input-group date']/child::div)[2]";
        String Tag = "//li[@class='tagit-new']/child::input";
        String description = "//div[@app-field-wrapper='description']//iframe";
        String sendCreatedEmail = "//label[@for='send_created_email']/preceding-sibling::input";

        String projectSettingsTab = "(//div[@class='horizontal-tabs']/descendant::a)[2]";
        String contactNotification = "(//select[@name='contact_notification']/following-sibling::button";
        String availableFeatures = "(//select[@id='available_features']/following-sibling::button";
        String viewTasks = "//input[@id='view_tasks']";
        String createTasks = "//input[@id='create_tasks']";
        String editTasks = "//input[@id='edit_tasks']";
        String commentTasks = "//input[@id='comment_on_tasks']";
        String viewTaskComments = "//input[@id='view_task_comments']";
        String viewTaskAttachments = "//input[@id='view_task_attachments']";
        String viewTaskItems = "//input[@id='view_task_checklist_items']";
        String uploadTasks = "//input[@id='upload_on_tasks']";
        String tasksLoggedTime = "//input[@id='view_task_total_logged_time']";
        String viewFinance = "//input[@id='view_finance_overview']";
        String uploadFiles = "//input[@id='upload_files']";
        String openDiscussions = "//input[@id='open_discussions']";
        String viewMilestones = "//input[@id='view_milestones']";
        String viewGantt = "//input[@id='view_gantt']";
        String viewTimesheets = "//input[@id='view_timesheets']";
        String viewActivity = "//input[@id='view_activity_log']";
        String viewTeamMembers = "//input[@id='view_team_members']";
        String hideTasks = "//input[@id='hide_tasks_on_main_tasks_table']";
        String submit = "//div[@class='panel-footer text-right']/child::button";
    }
}
