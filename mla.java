import java.util.Scanner;
public class mla {
public static String final_citation = "";
    public static void main(String[] args){
        System.out.println("Hello! In order to create the MLA Citation, please choose an option given below:");
        System.out.println("1. Type 1 if it is a physical book.\n2. Type 2 if it is a Periodical.\n3. Type 3 if it is an Electronic Source like Web Publication.");
        System.out.print("Enter your option: ");
        Scanner scanner_1 = new Scanner(System.in);
        int choice = scanner_1.nextInt();
        if (choice == 1){
            bookCit();
        } else if (choice == 2){
            // Something
        } else if ( choice == 3){
            // Something but harder
        }
        scanner_1.close();     
    }

    static void bookCit(){
        System.out.print("Does your book have a author ?: \n1. Yes\n2. No\nEnter Answer:");
        Scanner scanner_1 = new Scanner(System.in);
        int val = scanner_1.nextInt();
        if (val == 1){
            String name = author_name();
            final_citation += name;
        }
        scanner_1.close();
    }

    static String author_name(){
        String auth_name = "";
        System.out.println("");
        System.out.println("Who is the publisher of your book?\n1. Individual Authors\n2. Corporate or Organization ( Like American Allergy Association )");
        System.out.print("Enter value: ");
        Scanner scanner_3 = new Scanner(System.in);
        int type_author = scanner_3.nextInt();
        if (type_author == 1){
            System.out.println("Lets start by jotting down the authors you want to write.");
            Scanner scanner_2 = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of authors you have: ");
            int num_authors = scanner_2.nextInt();
            if (num_authors >= 3){
                System.out.println("Since you have more than 3 authors, mention only one author. The other authors will not be mentioned. 'et al' will be added in the end of the author to signify more than one author exist.");
                System.out.print("Enter the name of the author who is most important for the book: ");
                String auth_name_init = scanner.nextLine();
                int index_auth = auth_name_init.lastIndexOf(' ');
                String first_name_auth = auth_name_init.substring(index_auth+1, auth_name_init.length());
                String last_name_auth = auth_name_init.substring(0, index_auth);
                auth_name = last_name_auth + ", " + first_name_auth +  ", et al.";
            } else if (num_authors == 2){
                System.out.print("Enter the name of the first author: ");
                String auth_name_init = scanner.nextLine();
                int index_auth = auth_name_init.lastIndexOf(' ');
                String first_name_auth = auth_name_init.substring(index_auth+1, auth_name_init.length());
                String last_name_auth = auth_name_init.substring(0, index_auth);
                auth_name = last_name_auth + ", " + first_name_auth +  ", ";
                System.out.print("Enter the name of the second author: ");
                auth_name_init = scanner.nextLine();
                auth_name += "and " + auth_name_init +  ".";
            } else if (num_authors == 1){
                System.out.print("Enter the name of the author: ");
                String auth_name_init = scanner.nextLine();
                int index_auth = auth_name_init.lastIndexOf(' ');
                String first_name_auth = auth_name_init.substring(index_auth+1, auth_name_init.length());
                String last_name_auth = auth_name_init.substring(0, index_auth);
                auth_name = last_name_auth + ", " + first_name_auth +  ".";
            } else{
                System.out.println();
                System.out.println("Thats not a valid option. Exiting Program.");
                scanner_2.close();
                scanner.close();
                System.exit(0);
                return auth_name;
            }
            scanner.close();
            scanner_2.close();
            return auth_name;
        } else if (type_author == 2){
            System.out.print("Is the publisher and author the same? \n1. Yes\n2. No\nEnter Answer: ");
            Scanner scanner_5 = new Scanner(System.in);
            int publisher_type = scanner_5.nextInt();
            if (publisher_type == 2){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the name of the organization: ");
                String auth_name_init = scanner.nextLine();
                scanner_5.close();
                scanner.close();
                scanner_3.close();
                return auth_name_init + ".";
            } else if (publisher_type == 1){
                System.out.println("Since the publisher and author are same, we won't add it as author and keep it just for publisher");
                // start publisher
                scanner_5.close();
                scanner_3.close();
                return auth_name;
            } else {
                System.out.println("Not a valid answer");
                scanner_3.close();
                scanner_5.close();
                System.exit(0);
                return "";
            }
        } else {
            System.out.println("Not a valid answer");
            scanner_3.close();
            System.exit(0);
            return "";
        }
        
    } 
        
}   

