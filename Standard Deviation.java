class Result {

    public static void stdDev(List<Integer> arr) {

        int n=arr.size();
        double nsum=0;
        int sum=0;
        for(int i=0;i<arr.size();i++){
         sum+=arr.get(i);
     }
        double mean=sum/arr.size();

        for(int i=0;i<n;i++){
            nsum+= Math.pow(arr.get(i)-mean , 2);
        }
        double d= Math.sqrt((nsum/n));
        System.out.format("%.1f",d);
    }

}
