package coursework1;

import java.util.Iterator;

/**
 *
 * @author Student number 14024497
 */
public class MainInitialise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // gui not implemented
        // UniGui gui = new UniGui();
       
        
        // initialise system with some hard-coded data aded to the system
        // a gui has not yet been implementeed
        // the initial data will allow to print s summary of the system
        // by calling the produceReport() method in the TermSingleton instance
        
        Room a10 = new Room("a10", 10);
        Room a12 = new Room("a12", 12);
        Room a09 = new Room("a09", 10);
        
        // create some example teching staff members
        TeachingStaff johnDoe = new Professor("PN1111", "John Doe", "23 Plum Street Newbury", "john.doe@email.com", "office1", "programming");
        TeachingStaff rogerMoore = new Lecturer("LN2222", "Roger Moore", "14 Bond Street Northampton", "roger.moore@email.com", "office2", "security");
        TeachingStaff jethroTull = new Professor("PN2222", "Jethro Tull", "12 Flute avenue, Malmesbury", "jethro.tull@email.dot", "office4", "programming");
        TeachingStaff johnLennon = new Lecturer("LN3333", "John Lennon", "10 Sgt. Pepper's street", "jlennon@beatles.com", "office19", "security");
        TeachingStaff jamesNaughty = new Professor("PN4444", "James Naughty", "12 BBC radio 4 lane, London", "naughty@bbc.com", "office44", "databases");

        // set-up some example classes for testing
        Class cid1111 = johnDoe.teachClass("CID1111", "Introduction to programming1", johnDoe, "Monday", "10:00 - 12:00", a10, "programming");
        Class cid1112 = johnDoe.teachClass("CID1112", "Introduction to programming2", johnDoe, "Monday", "10:00 - 12:00", a10, "programming");
        Class cid1212 = rogerMoore.teachClass("CId1212", "Introduction to sytems security", rogerMoore, "Tuesday", "08:00 - 10:00", a12, "security");
        Class dbms01 = jamesNaughty.teachClass("dbms01", "Database Management Systems - principles", jamesNaughty, "Thursday", "14:00 - 16:00", a09, "databases");
        Class dbms02 = jamesNaughty.teachClass("DBMS02", "Database Management Systems - advanced", jamesNaughty, "Tuesday", "08:00 - 10:00", a10, "databases");
        Class poc01 = jethroTull.teachClass("POC01", "Principles of calculations", jethroTull, "Wednesday", "10:00 - 12:00", a12, "programming");
        Class ssa02 = rogerMoore.teachClass("SSA02", "Systems' security - advanced", rogerMoore, "Monday", "12:00 - 14:00", a09, "security");
        Class ns01 = johnLennon.teachClass("NS01", "Networking sytems - principles", johnLennon, "Tuesday", "10:00 - 12:00", a10, "security");
        Class ns02 = johnLennon.teachClass("NS02", "Netwrorking systems - advanced", johnLennon, "Friday", "08:00 - 10:00", a12, "security");
        Class food = jethroTull.teachClass("FOOD", "Further Object Oriented Programming", jethroTull, "Wednesday", "14:00 - 16:00", a12, "programming");
        
        // augment the system with 15 students
        Student carolStraw = new Student("SN001", "Carol Straw", "12 Strawbery lane, Bristol", "carol.straw@email.com");
        Student davidCoverdale = new Student("SN002", "David Coverdale", "12 Deep Purple street, London", "david.coverdale@email.com");
        Student johnLord = new Student("SN008", "John Lord", "10 Rainbow avenue, Southampton", "john.lord@email.com");
        Student juliaWinger = new Student("jW1401", "Julia Winger", "2 Commercial Road, Penryn", "julia.wiger@yahoo.com");
        Student israelMarro = new Student("IM1402", "Israel Marro", "189 Crfathaugh, Brora", "israel.marro@email.com");
        Student ralphPrendergast = new Student("RP1403", "Ralph Prendergast", "1 Orchard Cottages, Wyke Champflower", "r.prendergast@email.org");
        Student tranWesolowski = new Student("SW1404", "Stan Wesolowski", "23 New Town Row, Birmingham", "s.wesolowski@email.com");
        Student lucindaTichenor = new Student("LT1405", "LucidaTichenor", "26 Collins HIll, Fordham", "lucida.tichenor@gmail.com");
        Student liteGertner = new Student("LG1405", "Lita Gertner", "24 Market Way, Bath", "lita.gertner@email.org");
        Student romeoHarrod = new Student("RH1406", "Romeo Harrod", "65 Maidstone Road, Borough Green", "romeo.h@email.com");
        Student jadaParrino = new Student("JP1404", "Jada Parrino", "7 Dalton Square, Bristol", "jada.parrino@email.com");
        Student yasmineHammes = new Student("YH1404", "YasmineHemmes", "14 Belmont Avenue, Bath", "yasmine.b@email.com");
        
        //enroll students on some classes
        cid1111.addStudentToClass(carolStraw);
        cid1111.addStudentToClass(johnLord);
        cid1112.addStudentToClass(carolStraw);
        cid1112.addStudentToClass(davidCoverdale);
        cid1112.addStudentToClass(johnLord);
        cid1212.addStudentToClass(johnLord);
        cid1212.addStudentToClass(davidCoverdale);
        cid1212.addStudentToClass(carolStraw);
        dbms01.addStudentToClass(juliaWinger);
        dbms01.addStudentToClass(liteGertner);
        dbms01.addStudentToClass(ralphPrendergast);
        dbms02.addStudentToClass(liteGertner);
        dbms02.addStudentToClass(jadaParrino);
        dbms02.addStudentToClass(romeoHarrod);
        ssa02.addStudentToClass(carolStraw);
        ssa02.addStudentToClass(davidCoverdale);
        ssa02.addStudentToClass(johnLord);
        ssa02.addStudentToClass(liteGertner);
        ssa02.addStudentToClass(juliaWinger);
        ssa02.addStudentToClass(israelMarro);
        poc01.addStudentToClass(tranWesolowski);
        poc01.addStudentToClass(lucindaTichenor);
        poc01.addStudentToClass(yasmineHammes);
        ns01.addStudentToClass(tranWesolowski);
        ns01.addStudentToClass(romeoHarrod);
        ns01.addStudentToClass(jadaParrino);
        ns01.addStudentToClass(tranWesolowski);
        ns02.addStudentToClass(ralphPrendergast);
        ns02.addStudentToClass(liteGertner);
        ns02.addStudentToClass(juliaWinger);
        ns02.addStudentToClass(johnLord);
        food.addStudentToClass(johnLord);
        food.addStudentToClass(juliaWinger);
        food.addStudentToClass(israelMarro);
        food.addStudentToClass(ralphPrendergast);
        
        Researcher newResearcher = new Researcher("RId444", "Teresa May", "10 Downing Street, London", "teresa.may@email.com", "office11", "politics");
        // create researcher meeting Teaching staff appointment
        newResearcher.bookTeachingStaffAppointment("Week8", "Thursday", "8:00 - 10:00", rogerMoore);
        
        Visitor testVisitor1 = new Visitor("David Bowie", "01111555666");
        Visitor testVisitor2 = new Visitor("David Cameron", "0999999999");
        
        // book some appointments
        testVisitor1.bookResearchersAppointment("Week1", "Monday", "8:00 - 10:00", newResearcher);
        testVisitor2.bookTeachingStaffAppointment("Week3", "Wednesday", "16:00 - 18:00", johnDoe);
       
        //System.out.println("Testing the TermSingleton produceReport() method");
        System.out.println("Coursework 1. Student number 14024497");
        System.out.println("Produce report.");
        TermSingleton.getInstance().produceReport();
        
    }
    
}
