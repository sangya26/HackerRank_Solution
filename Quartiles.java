class Result {


    public static List<Integer> quartiles(List<Integer> arr) {
    // Write your code here
        List arr1=new ArrayList<>();
        Collections.sort(arr);
        
        //lower part
        int low= median(arr.subList(0, arr.size()/2));
        arr1.add(low);
        
        //middle part
        int mid= median(arr);
        arr1.add(mid);
        
        //upper part
        int up= (arr.size() % 2 == 0) ? median(arr.subList(arr.size()/2, arr.size())) : median(arr.subList(arr.size()/2+1, arr.size()));
        arr1.add(up);
        
        return arr1;
    }
    
    public static int median(List<Integer> arr){
        int ans = (arr.size()%2 == 0)?(arr.get(arr.size()/2)+arr.get(arr.size()/2 -1))/2 : arr.get(arr.size()/2);
        return ans;
    }

}
