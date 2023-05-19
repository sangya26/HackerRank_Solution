class Result {

    /*
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     */

    public static void weightedMean(List<Integer> X, List<Integer> W) {
    // Write your code here
    Double sumX =0.0, sumW=0.0;
    int n= X.size();
    for(int i=0;i<n; i++){
        sumX += (X.get(i) * W.get(i));
        sumW += W.get(i); 
    }
    System.out.format("%.1f",(sumX/sumW));

    }

}
