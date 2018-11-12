# Home Challenge
Thank you for giving me the opportunity to attend the Home Challenge of N26. I have worked for task 1 and task 3. Details information about both tasks are given below.

Assignment github URL : https://github.com/ArifMahmud/arif-mahmud.git
# Task 1:
##### List of ideas for testing moneyfy Application:
- Functional Test
      a. Account manipulation (Add/Merge/Delete/Money Transfer)
      b. Adding income and expense
      c. Expense chart
      d. Balance statistics daily/monthly/yearly
      e. Income/Expense category manipulation(Add/Delete/Merge)
      f. Data manipulation(Data Backup/Data Storage/Data Restore/Data Clear/Data       Sync/Data Export)
      g. Budget Mode activity
      h. General Settings(Language/Date-Time/Theme/Currency/Carry Over)
- Performance Test
      a. Battery Drainage
      b. Storage
      c. OS Compatibility
      d. UX Experience
-	Security Test
      a. Data Security
##### Prioritized Test Case for moneyfy:

| #ID | Test Scenario/Suite | Test Case | Priority | Precondition | Expected Result |
|-----|----------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|----------|--------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| 1 | Account and Income | Try to add account/s with | P1 | Account should have a name and image | Account should be created successfully |
| 2 |  | Try to add different type of income like Salary/Deposite/Savings | P1 | Income needs to be added with proper amount | Income should be added under a respective account |
| 3 |  | Try to merger multiple accounts balance | P2 | At least two accounts should have been available for any user | Two accounts should be merged and summation of balance of two accounts should be shown in single account |
| 4 |  | Try to delete any account | P2 | User needs to have an account | Account should be deleted and statistics of income and expenses should be reset |
| 5 |  | Try to edit account information | P2 | User needs to have an account | Account name and card image and balance should be changeable |
| 6 |  | Try to transfer money between two accounts | P1 | At least two accounts should have been available for any user | Money should be transferred from account(from) to account (to) |
| 7 |  | Check whether income and expense can be maintainable by selecting each single account when user has multiple account |  | User needs to have multiple account | User should have eligible to maintain income and expense statistics from each single account |
| 8 |  | Check whether income and expense can be maintainable from combination of all accounts when user has multiple account |  | User needs to have multiple account | User should have eligible to maintain income and expense statistics from combination of all  accounts |
| 9 |  | Try to delete any added income source | P2 | User should have at least one added income source like Salary/Savings/Deposite | Income source should be deleted |
| 10 | Expense and Balance | Try to add expense/s when user have enough money in account | P1 | User should have enough money in account | Balance should be a reflect of arithmatic operation between Income and Expense |
| 11 |  | Try to add expense/s when user doesn't have enough money in account | P1 | User should not have enougn income in account | Balance should be marked as negative and expense should be added |
| 12 |  | Try to delete any added expense/s | P2 | User should have at least one added expense source like Home/Food/Car | Expense source should be deleted |
| 13 |  | Check whether all income and expense statistics are showing under balance | P1 | User should have added income and expenses | Statistics of income and expense should be shown properly |
| 14 |  | Check whether income and expense statistics are showing properly with amount and date | P1 | User should have added income and expenses | Statistics of income and expense should be shown with proper amount and date |
| 15 | Expense chart in App Home Page | Check whether all expenses, added by user are showing properly in expense chart | P1 | User should have added income and expenses | Expense chart should show all expenses that added by user with a linked up line |
| 16 |  | Check whether each expense item is showing with proper percentile of total expense amount | P1 | User should have added income and expenses | Each expense item, added by user should show a proper percentile of total expense amount |
| 17 |  | Check whether all expense item's percentile summation | P1 | User should have added income and expenses | Summation should be 100% |
| 18 | Time constraint for maintaining income and expense | Check whether user can keep track of income and expense for a specific day | P1 | User should select Day option for maintaining income and expense | Income and expense statistics should reflect only for a day, specified by user |
| 19 |  | Check whether user can keep track of income and expense for a specific month | P1 | User should select Month option for maintaining income and expense | Income and expense statistics should reflect only for a month, specified by user |
| 20 |  | Check whether user can keep track of income and expense for a specific year | P1 | User should select year option for maintaining income and expense | Income and expense statistics should reflect only for a year, specified by user |
| 21 |  | Check whether user can keep track of income and expense for a specific unspecified time (All) | P1 | User should select All option for maintaining income and expense | Income and expense statistics should reflect only for all time |
| 22 | Income/Expense category | Try to add a new category of income/expense | P2 |  | User should be able to add a new category of income/expense |
| 23 |  | Try to merge two income/expense categories | P2 |  | User should be able to merge two different categories of income/expense |
| 24 |  | Check whether user can enable/disable any category of income/expense | P2 |  | User should be able to enable/disable any category of income/expense |
| 25 |  | Check whether user can delete any category of income/expense | P2 |  | User should be able to delete any category of income/expense |
| 26 |  | Check whether the income/expense statistics for any specific category is being auto-removed when user makes deletion of any category of income/expense | P1 | Users add a expense for any category like Food/Health/Pet. Then Users delete the expense category Pet//Health/Food | Statistics of income/expense for any category should be removed if the category is deleted by user |
| 27 | General Settings | Check whether user can change currency for maintaining income/expense currency | P2 |  | User should be able to change currency |
| 28 |  | Check whether all income and expense statistics are showing in user selected currency | P2 |  | Income and Expense statistics should be shown in user selected currency |
| 29 |  | Try to make statistics of income and expense with a budget mode | P1 | User should select budget mode from settings | User should be able to add income/expense in budget mode |
| 30 |  | Check whether the income amount is fixed to the budget amount when users activate the budget amount | P1 | User account has $2000. User has activated a budget of $1000. User income is fixed to $1000 | Income should be fixed to budget amount |
| 31 |  | Check whether a new addition of income is added to account and income both or not when users activate budget mode | P1 | User account has $2000. User has activated a budget of $1000. User added a income of $1000. | This amount should only be added to account but not in income total amount |
| 32 |  | Check whether user can change the language of Application | P1 |  | User should be able to change the language of Application |
| 33 |  | Check whether user can export the statistics of income/expense to a file or not | P3 |  | User should be able to export the statistics |
| 34 |  | Check whether user can sync data between two devices through dropbox sync | P3 |  | User should be able to sync monefy data between devices through dropbox account |
| 35 |  | Check whether user can sync data between two devices through google account sync | P3 |  | User should be able to sync monefy data between devices through google account sync |
| 36 |  | Check whether user can create data backup for monefy data for any specific time | P3 |  | User should be able to keep data backup |
| 37 |  | Check the memory size that occupy by monefy data when user activates data backup facility | P1 |  | Memory size should not be higher |
| 38 |  | Check whether user can restore monefy data for any specific time from the backup data | P3 | User needs to activate data backup facility | User should be able to restore data from backup data |
| 39 |  | Check whether all backup data is deleted or not when App storage data is being cleared from Mobile settings | P1 |  | Backup Data should be cleared |
| 40 |  | Check whether statistics of income/expense is being cleared when users do data clear from App settings | P2 |  | Statistics should be cleared |
| 41 | Performance of Application | Check that how much battery/CPU is being occupied by the App | P4 |  | Should be less |
| 42 |  | Check the minimum and maximum android OS version that is supported for the App | P4 |  |  |

# Task 3:

### Best Buy Store REST API Automation
##### List of proposed test case for automation:

| #ID | Test Scenario/Suite | Test Case | Precondition | Expected Result |
|-----|----------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|----------|--------------------------------------------------------------------------------------------------------------------|
| 1 | Create/Update/Delete/Get Product | Create a product with valid data | All data should be valid type and length | Product should be created |
| 2 |  | Create a product with invalid data type | Any of mandatory data type should be invalid | Product should not be created |
| 3 |  | Create product with invalid data length | Any type of mandatory data length should be invalid | Product should not be created |
| 4 |  | Create a product without mandatory data | Any of mandatory data should be absent | Product should not be created |
| 5 |  | Update a product with valid data | All data should be valid type and length | Product should be updated |
| 6 |  | Update a product with invalid data type | All data should be valid type and length | Product should be updated|
| 7 |  | Delete a product with valid product ID  | Product should be available in system | Product should be deleted |
| 8 |  | Get product list with a specific limit  | Products should be available in system |List of products should be shown as per limit |
| 9 |  | Get product with sorted price | Product should be available in system| Product should be shown with sorted price |
| 10 |  |  Get product within a price range | Product should be available in system | Product list should be shown within the specified price range|
| 11 |  | Check whether the total count of product is exact or not | Certain number of products should be available in system | Total count should show as per total number of products in system|
| 12 |  |Get products with free shipping| Product should be available in system | Product list with free shipping should be shown |
| 13 |  | Get product with a specific product ID | Product should be available in system| Product with specific ID should be shown|
| 14 |  Create/Update/Delete/Get Service| Create a service with valid data| All data should be valid type and length | Service should be created |
| 15 |  | Create a service with invalid data length |Any of mandatory data length should be invalid | Service should not be created|
| 16 |  | Create a service without mandatory data | Any of mandatory data should be absent | Service should not be created |
| 17 |  | Update a service with valid data | All data should be valid type and length | Service should be updated |
| 18 |  | Update a service without mandatory data| Any of mandatory data should be absent | Service should be updated |
| 19 |  | Delete a service with valid service ID | Service should be available in system | Service should be deleted |
| 20 |  | Get service with specific service ID  | service should be available in system | service should be shown |
| 21 | Create/Update/Delete/Get Store | Create a store with valid data | All data should be valid type and length | Store should be created |
| 22 |  | Create a store with invalid data type| Any of mandatory data type should be invalid | Store should not be created|
| 23 |  | Create a store without mandatory data| Any of mandatory data should be absent |Store should not be created |
| 24 |  | Update a store with valid data | All data should be valid type and length|Store should be updated|
| 25 |  | Delete a store with valid store ID | store should be available in system |Store should be deleted|
|26|	|	Get a store for any specific city/state	|Stores in requested city should be available	|Store should be found|
| 27 |  | Get store with specific store ID| store should be available in system | store should be shown|
| 28 |  Create/Update/Delete/Get Category| Create a category with valid data| All data should be valid type and length |Category should be created |
| 29 |  | Create a category with invalid data length | Any of mandatory data length should be invalid|Category should not be created|
| 30 |  | Try to create a category with duplicate ID | A category with tried ID should be prepsent in system previously |Category should not be created|
|31|	|	Create a category without mandatory data |Any of mandatory data should be absent|Category should not be created|
|32|	|	Update a category with valid data	|All data should be valid type and length	|Category should be updated |
| 33 |  | Update a category with invalid data type| Any of mandatory data type should be invalid | Category should be updated|
| 34 |  | Delete a category with valid category ID| category should be available in system |Category should be deleted|
| 35 |  | Get a category with name| Category with name should be available|Category should be found|
| 36 |  | Get category with specific category ID| category should be available in system |category should be shown|
|37|	|	Get list for all category|category should be available in system |category should be shown|

### Short Description about API Automation Project
1. The project is developed using Spock Framework (Spock is a testing and specification framework for Java and Groovy applications which supports BDD Testing)
2. I have used groovy as scripting language and Gradle as build tool
3. For any REST API, general scripting pattern is as follows:

##### def "A short description of test case goes here"() {
#####  when:
    //In this section, we can prepare request data and other needful data as well

#####   then:
    //Expected response data will be verified here
#####   cleanup:
    //Here we can clean those data which are created in system for testing purpose

#####   where:
    //Data driven test set will be available here

4. If we run test for this project, command should be "gradlew clean test" (If we use gradle wrapper). Else, "gradle clean test" (If we use Gradle)
5. After running a test, a report will be generated in a .html file. We can see each test case result/all over test result. Also we can see request/response for any test case from "Standard Output" which is available in the webview (index.html).
