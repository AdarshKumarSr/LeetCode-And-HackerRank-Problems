// Last updated: 7/16/2025, 9:33:28 PM
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
    }
};
// createHelloWorld();
const f = createHelloWorld();
console.log(f()); // "Hello World"
