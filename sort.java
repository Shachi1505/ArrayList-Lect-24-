public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length");
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Elements");
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i) + " ");
        }
    }
}
