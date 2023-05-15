import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        HashSet<Integer>integers=new HashSet<>();
//        integers.add(6);
//        integers.add(5);
//        integers.add(3);
//        integers.add(7);
//        integers.add(1);
//
//
//        System.out.println(integers);
////
//        LinkedHashSet<Integer>integers1=new LinkedHashSet<>();
//        integers1.add(6);
//        integers1.add(5);
//        integers1.add(3);
//        integers1.add(7);
//        integers1.add(1);
//
//        System.out.println(integers1);
//
//        TreeSet<Integer>integers2=new TreeSet<>();
//        integers2.add(6);
//        integers2.add(5);
//        integers2.add(3);
//        integers2.add(7);
//        integers2.add(1);
//
//        System.out.println(integers2);

//        Iterator<Integer>iterator=integers.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }

//
//        TreeSet<Student>students = new TreeSet<>();
//        students.add(new Student("Adina","java","java6",5));
//        students.add(new Student("Aidana","java","java6",9));
//        students.add(new Student("Aigerim","java","java6",6));
//        students.add(new Student("Narynbek","java","java6",4));
//        students.add(new Student("Nazira","java","java6",3));
//        students.add(new Student("Zulkumar","java","java6",2));
//        students.add(new Student("Biybolot","java","java6",1));
//        students.add(new Student("Aida","java","java6",8));
//        students.add(new Student("Jumadyl","java","java6",9));
//        students.add(new Student("Asko","java","java6",2));
//
//
//
//        Iterator<Student>iterator=students.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next().getGrade()<=3){
//               iterator.remove();
//            }
//        }
//
//        System.out.println(students);
        Set<Integer>integers=new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Set<Integer>integers1=new HashSet<>();
        integers1.add(0);
        integers1.add(1);
        integers1.add(2);

        System.out.println(integers);
        System.out.println(integers1);

        System.out.println(symmetricDifference(integers,integers1));


    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer>newSet=new HashSet<>();
        for ( Integer newSet1:set1) {
            for (Integer newSet2:set2) {
                if(!set1.contains(newSet2)){
                    newSet.add(newSet2);
                }else if(!set2.contains(newSet1)){
                     newSet.add(newSet1);
                }

            }


        }

return newSet;

    }


}