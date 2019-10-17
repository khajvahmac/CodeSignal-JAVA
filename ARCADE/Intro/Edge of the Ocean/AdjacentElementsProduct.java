int adjacentElementsProduct(int[] inputArray) {
    int largestProduct = inputArray[0] * inputArray[1];
    for (int i = 1; i < inputArray.length - 1; i++) {
        int product = inputArray[i] * inputArray[i + 1];
        largestProduct = Math.max(product, largestProduct);
    }
    return largestProduct;
}