
class Result {

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
    // Print your answer to 1 decimal place within this function
    //adding values with actual frequency to a new list
    List<Integer> arr=new ArrayList<>();
    for(int i=0;i<values.size();i++){
        for(int j=0;j<freqs.get(i);j++){
            arr.add(values.get(i));
        }
    }
    List<Integer> quartile = quartile(arr);
    double interQuartile = quartile.get(2) - quartile.get(0);
    System.out.println(interQuartile);
    }
    
    public static List<Integer> quartile(List<Integer> arr){
        Collections.sort(arr);
        int size=arr.size();
        int q1, q3=0;
        int q2=median(arr);
        if(size % 2 == 0){
           q1 = median(arr.subList(0, (size/2)));
           q3 = median(arr.subList(size/2, size));
        }
        else{
           int middle = ((size + 1) / 2) - 1;
           q1 = median(arr.subList(0, middle));
           q3 = median(arr.subList(middle + 1, size));
        }
        return Arrays.asList(q1,q2,q3);
    }
    public static int median(List<Integer> arr){
        int n =  arr.size();
        int median = 0;
        if(n % 2 == 0){
            median =  (arr.get((n / 2) - 1) + arr.get(n / 2)) / 2;
        }
        else{
            median =  arr.get(((n + 1) / 2) - 1);
        }
        return median;
    }

}
