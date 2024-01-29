package bioskophb;

/**
 *
 * @author Dionisius - James Jordan - Jason Nathaniel
 */
class Branch {

    String name;
    String location;
    Studio[] arrStudio;

    public Branch(String _name, String _location, int _totalStudio) {
        this.name = _name;
        this.location = _location;
        this.arrStudio = new Studio[_totalStudio];

        // array init
        for (int i = 0; i < _totalStudio; i++) {
            arrStudio[i] = new Studio();
        }
    }
}

class Film {

    String title;
    String genre;
    int duration;
    String[][] schedule = new String[3][2];

    public Film() {
    }

    public Film(String _title, String _genre, int _duration) {
        this.title = _title;
        this.genre = _genre;
        this.duration = _duration;
        this.schedule[0][0] = "Senin 26 Feb 22 jam 17";
        this.schedule[0][1] = "Senin 26 Feb 22 jam 19";
        this.schedule[1][0] = "Selasa 27 Feb 22 jam 17";
        this.schedule[1][1] = "Selasa 27 Feb 22 jam 19";
        this.schedule[2][0] = "Rabu 28 Feb 22 jam 17";
        this.schedule[2][1] = "Rabu 28 Feb 22 jam 19";
    }
}

class Studio { // 1 studio hanya 1 film aja

    String code;
    boolean[][] seats = new boolean[6][5]; 
    int capacity; // seats.length
    Film film = new Film();
    // atau kalau mau dipisah ke Schedule, silakan. asal paham
    // Schedule schedule = new Schedule();

    public Studio() {
        this.capacity = seats.length * seats[0].length;
    }

    public Studio(String _code) {
        this.code = _code;
        this.capacity = seats.length * seats[0].length;
    }
}

class FoodBvg { // asumsi: makan dan minum jadi 1

    String name;
    int unitPrice;

    public FoodBvg(String _name, int _unitPrice) {
        this.name = _name;
        this.unitPrice = _unitPrice;
    }
}

//class Schedule {
//
//    String hari;
//    String jam;
//    boolean[][] seats = new boolean[6][5];
//
//}

class User {

    String name;
    String password;
    String role; // user biasa atau admin

    public User(String _name, String _password, String _role) {
        this.name = _name;
        this.password = _password;
        this.role = _role;
    }
}

class Transaction {

    String txId;
    String txDate;
    Ticket ticket;
    FoodBvg foodBvg;

    public Transaction(String _txId, String _txDate) {
        this.txId = _txId;
        this.txDate = _txDate;
    }
}

class Ticket {

    int unitPrice;
    Studio studio;
    Film film;

    public Ticket(int _unitPrice) {
        this.unitPrice = _unitPrice;
    }
}

class BioskopHB {

    public static void main(String[] args) {
        // inisialisasi sekaligus
        Branch[] arrBranch = {
            new Branch("BiskopHB Tupai", "Jl. Tupai no. 18", 3),
            new Branch("BiskopHB Cemara", "Jl. Cemara no. 18", 5),
            new Branch("BiskopHB Jawa", "Jl. Jawa no. 6", 4)
        };

        // contoh ngisi data
        arrBranch[0].arrStudio[0].code = "B";
        arrBranch[0].arrStudio[0].film.genre = "komedi";
        arrBranch[2].arrStudio[2].seats[3][2] = true;
        arrBranch[1].arrStudio[2].film.schedule[1][1] = "Selasa 27 Feb 22 jam 19";

        System.out.println(arrBranch[0].arrStudio[0].code);
        System.out.println(arrBranch[0].arrStudio[0].film.genre);
        System.out.println(arrBranch[1].arrStudio[0].capacity);
        System.out.println(arrBranch[2].arrStudio[2].seats[3][2]);
        System.out.println(arrBranch[1].arrStudio[2].film.schedule[1][1]);
    }
}
