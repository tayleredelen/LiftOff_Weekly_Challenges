function FirstReverse(str) {
  // Split the string into an array of characters
  var charArray = str.split('');
  // Reverse the array of characters
  var reversedArray = charArray.reverse();
  // Join the reversed array of characters back into a string
  var reversedStr = reversedArray.join('');

  return reversedStr;

}

// keep this function call here
console.log(FirstReverse(readline()));