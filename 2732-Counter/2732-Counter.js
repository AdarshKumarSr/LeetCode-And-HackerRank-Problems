// Last updated: 7/16/2025, 9:33:29 PM
/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    
    return function() {
        return n++;
    };
};

 
  const counter = createCounter(10)
  console.log(counter())   
  console.log(counter())  
  console.log(counter())  

 