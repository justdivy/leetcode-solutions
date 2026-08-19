class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> reserved = new HashMap<>();

          for (int[] seat : reservedSeats) {
            reserved
                .computeIfAbsent(seat[0], k -> new HashSet<>())
                .add(seat[1]);
        }

        int result = (n-reserved.size()) * 2;
        for(Set<Integer>seats : reserved.values()){
            boolean left = true;
            boolean middle = true;
            boolean right = true;

            for(int seat: seats){
                if(seat >= 2 && seat <= 5){
                    left = false;
                }
                if(seat >= 4 && seat <= 7){
                    middle = false;
                }
                if(seat >= 6 && seat <= 9){
                    right = false;
                }
            }
            if(left && right){
                result = result + 2;
            }else if(left || middle || right){
                result = result + 1;
            }
        }
        return result;
    }
}