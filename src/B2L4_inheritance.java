public class B2L4_inheritance {
    public static void main(String[] args){


        Student s1 = new Student();
        s1.setName("Stan");

        Teacher t1 = new Teacher();
        t1.setName("Ed");

        Parent Pt = new Parent();
        Pt.setName("Martin");
        Pt.setvote(true);
        Pt.getvote();

        adult at = new adult();
        at.setName("Blen");
        at.setcan_cook(false);
        at.getcan_cook();

        Trainer tr1 = new Trainer();
        tr1.setName("pipo");
        tr1.setSubject("Programming");

        System.out.println("\033[1;92m"+"hallo daar " );

        Person p1 = new Person();
        p1.setName("jaap");




        Person[] people = {
                new Teacher(),
                new Student()

        };
        Teacher t = (Teacher)people[0];
        t.setName("Job");
        t.setIq(9);
        t.addDiploma("Dierenzorg");

        Student s = (Student)people[1];
        s.setName("mamalou");
        s.setIq(13);
        s.addCourse("PRO2");
        s.addDiploma("VMBO T");

        for (Person person : people) {
            System.out.println("De naam  van de volwassene  is " + at.getName() + " en kan " + at.getcan_cook() + " koken" );
            System.out.println("De naam van de ouder is " + Pt.getName() + " en stemt " + Pt.getvote() + " stemmen." );
            System.out.println(person.getName() + " has an IQ of " + person.getIq() + " and has the following diplomas " + person.getDiplomas());

        }

    }
}