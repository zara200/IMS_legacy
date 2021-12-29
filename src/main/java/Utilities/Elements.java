package Utilities;

public class Elements {
    public String Sign_in="//input[@type=\"email\"]";
    public String Password="//input[@type=\"password\"]";
    public String Submit="//button[@type=\"submit\"]";
    public String po="//span[contains(text(), 'PO Management')]";
    public String create_po="//span[contains(text(), 'Create Purchase Order')]";
    public String click_sup="//span[@class=\"selection\"]/span[1]";
    public String sel_sup="//span[@class=\"select2-results\"]/ul/li[3]";
    public String click_seller="//*[@id=\"kt_content_container\"]/div/div/form/div/div[2]/div/div[2]/span/span[1]/span";
    public String sel_seller="//span[@class=\"select2-results\"]/ul/li[2]";
    public String click_country="//span[@class=\"select2-selection select2-selection--single form-select form-select-sm\"]/span[1]/span";
    public String sel_country="//span[@class=\"select2-results\"]/ul";
    public String click_warehouse="//*[@id=\"kt_content_container\"]/div/div/form/div/div[2]/div/div[4]/div/span/span[1]/span";
    public String sel_warehouse="//span[@class=\"select2-results\"]/ul";
    public String create_po_btn="//button[@type=\"submit\"]";
    public String ok="//button[@class=\"swal2-confirm swal2-styled\"]";
    public String edit_btn="//a[@class=\"btn-sm btn btn-clean  btn-light-primary btn-icon me-2 p-0\"]";
    public String product="//span[@id='select2-product-container']";
    public String product_id="//input[@class=\"select2-search__field\"]";
    public String select_option="//ul[@class=\"select2-results__options\"]/li[1]";
    public String quantity="//input[@name=\"quantity\"]";
    public String price="//input[@name=\"price\"]";
    public String create_po_item="//div[@class=\"card-footer\"]/button[2]";
    public String create_po_edit="//a[@class=\"btn-sm btn btn-clean  btn-light-primary btn-icon me-2 p-0\"]";
    public String po_ok="//button[@class=\"swal2-confirm swal2-styled\"]";
    public String po_list="//span[contains(text(), 'Purchase Order List')]";
    public String click_status="//select[@name=\"status\"]";
    public String invoiced="//select[@name=\"status\"]/option[2]";
    public String save_changes="//div[@class=\"card-footer\"]/button[1]";
    public String po_ok_updated="//button[@class=\"swal2-confirm swal2-styled\"]";
    public String receive="//a[@class=\"btn-sm btn btn-clean btn-light-info btn-icon me-2 p-0\"]";
    public String refresh="//span[contains(text(), 'Refresh / Prepare order for receive')]";
    public String select="//div[@class=\"form-check form-check-sm form-check-custom form-check-solid me-3\"]/input";
    public String all_received="//button[@data-type=\"selected\"]";
    public String closed="//a[contains(text(), 'Mark order as closed')]";
    public String ok_close="//button[contains(text(), 'OK')]";
    public String po1="//tr[@class=\"odd\"]/td[1]";
    public String Movement="//span[contains(text(), 'Movement')]";
    public String Move_to_Qc="//span[contains(text(), 'Move To QC')]";
    public String search_po="//input[@name=\"po\"]";
    public String search="//button[contains(text(), 'Search')]";
    public String move_all="//button[contains(text(), 'Move all selected Items to QC')]";
    public String move_ok="//button[contains(text(), 'OK')]";
    public String quality_control="//div[@id=\"#kt_aside_menu\"]/div[9]/span/span[2]";
    public String quality_control_list="//span[contains(text(), 'Quality Control List')]";
    public String Qc_completed="//button[@title=\"QC Completed\"]";
    public String Add_comment="//input[@name=\"comment\"]";
    public String Save="//button[@id=\"update-qc-process\"]";
    public String Move_to_putaway="//span[contains(text(),'Move To Putaway')]";
    public String Move_to_putaway_btn="//button[@class=\"btn btn-primary btn-sm me-3\"]";
    public String Inventory_movement="//span[contains(text(), 'Inventory Movement')]";
    public String location="//span[@class=\"selection\"]/span[1]/span[1][@title=\" Select Location \"]";
    public String location_field="//input[@class=\"select2-search__field\"]";
    public String location_field_1="//span[@class=\"select2-results\"]/ul/li[2]";
    public String move_items="//button[@class=\"btn btn-primary btn-sm\"]";
    public String Select_parent_category="//span[contains ( text(), ' Select parent category')]";
    public String search_field="//input[@class=\"select2-search__field\"]";
    public String sub_category="//select[@placeholder=\"Select subcategory\"]";
    public String sub_category_option = "//*[@id=\"category-id-\"]/option[2]";
    public String online_price="//input[@label=\"Online Price\"]";
    public String error="//div[@class=\"alert alert-danger error-message\"]";




    // Admin

    public String admin_email="/html/body/div/div/div/div/div/div[2]/form/div[1]/input";
    public String admin_password="/html/body/div/div/div/div/div/div[2]/form/div[2]/input";
    public String admin_submit="/html/body/div/div/div/div/div/div[2]/form/div[3]/button";
    public String inventory_admin="//a[contains(text(),'Inventory')]";
    public String pending_content="//li[@class=\"nav-item dropdown show\"]/div/a";
    public String po_admin="//input[@name=\"po\"]";
    public String search_pc="//button[contains (text(), 'Search')]";
    public String Validate_admin="//button[contains (text (), 'Validate')]";
    public String mark_as_close="//a[contains (text (), 'Mark all same items valid')]";
    public String publish="//li[@class=\"nav-item dropdown show\"]/div/a[2]";
    public String publish_item="//button[contains( text(),'Publish Item')]";
    public String publish_btn="//button[contains (text(), 'Publish')]";
    public String publish_item_btn="//button[contains ( text(), 'Publish Item')]";
}








