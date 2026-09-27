/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let n1 = 0;
    let n2 = 1;
    while(true){
        yield n1;
        [n1,n2] = [n2,n1 + n2];
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna