int matrixElementsSum(int[][] matrix) {
    int totalPrice = 0;
    for (int column = 0; column < matrix[0].length; column++) {
        for (int row = 0; row < matrix.length; row++) {
            int price = matrix[row][column];            
           if (price == 0)
                break;
            totalPrice += price;
        }
    }
    
    return totalPrice;
}