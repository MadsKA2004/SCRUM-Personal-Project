public class UI {

    public UI(){

    }

    public void run() {
        boolean isRunning = true;

        while (isRunning){
            showMenu();
            int choice = Integer.parseInt(IO.readln("Indtast dit valg: ").trim());

            switch (choice) {
                case 0 -> isRunning = false;
                case 1 -> showKassererMenu();
                case 2 -> showTrainerMenu();
                case 3 -> showChairmanMenu();
                case 4 -> showMemberMenu();
                default -> IO.println("Ugyldigt valg.");
            }
        }
    }
    public void showMenu(){
        IO.println("""
                \n—————Hovedmenu—————
                1: Kasserer
                2: Træner
                3: Formand
                4: Medlem
                0: Afslut Program""");
    }

    public void showTrainerMenu() {
        boolean trainerIsrunning = true;

        IO.println("""
                \n—————Trænermenu—————
                1: Stævneresultater
                2: Svømmediscipliner
                0: Gå tilbage""");

        while (trainerIsrunning) {
            int trainerChoice = Integer.parseInt(IO.readln("Indtast dit valg: ").trim());

            switch (trainerChoice) {
                case 0 -> trainerIsrunning = false;
                case 1 -> IO.println("Stævneresultater....");
                case 2 -> IO.println("Svømmediscipliner....");
                default -> IO.println("Ugyldigt valg.");
            }
        }
    }

    public void showChairmanMenu(){
        boolean chairmanIsRunning = true;

        IO.println("""
                \n—————Formandmenu—————
                1: Opret medlem
                2: Rediger medlem
                0: Gå tilbage""");

        while (chairmanIsRunning) {
            int chairmanChoice = Integer.parseInt(IO.readln("Indtast dit valg: ").trim());

            switch (chairmanChoice) {
                case 0 -> chairmanIsRunning = false;
                case 1 -> IO.println("Opret medlem...."); //Skal erstattes med en metode
                case 2 -> IO.println("Redigerer medlem"); //Skal også erstattes med en metode
                default -> IO.println("Ugyldigt valg.");
            }
        }
    }

    public void showKassererMenu() {
        boolean kassererIsRunning = true;

        IO.println("""
                \n—————Kasserermenu—————
                1: Årlig indtjening
                2: Medlemmer i restance
                0: Gå tilbage""");

        while (kassererIsRunning) {
            int kassererChoice = Integer.parseInt(IO.readln("Indtast dit valg: ").trim());

            switch (kassererChoice) {
                case 0 -> kassererIsRunning = false;
                case 1 -> IO.println("Indtjening");
                case 2 -> IO.println("Medlemmer i restance");
                default -> IO.println("Ugyldigt valg.");
            }
        }
    }

    public void showMemberMenu(){
        boolean memberMenu = true;

        IO.println("""
                \n—————Medlemsmenu—————
                1: Tilmeld medlemskab
                2: Konto-oversigt
                0: Gå tilbage""");

        while (memberMenu) {
            int memberChoice = Integer.parseInt(IO.readln("Indtast dit valg: ").trim());

            switch (memberChoice) {
                case 0 -> memberMenu = false;
                case 1 -> IO.println("Tilmeld");
                case 2 -> IO.println("Konto-balance");
                default -> IO.println("Ugyldigt valg.");
            }
        }
    }
}
