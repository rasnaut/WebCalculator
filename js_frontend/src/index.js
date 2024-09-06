let currentOperation = null;
let firstOperand = null;

function appendNumber(number) {
    const display = document.getElementById('display');
    display.value += number;
}

function setOperation(operation) {
    const display = document.getElementById('display');
    firstOperand = parseInt(display.value);
    currentOperation = operation;
    display.value = '';
}

function calculate() {
    const display = document.getElementById('display');
    const secondOperand = parseInt(display.value);

    if (currentOperation === '+') {
        fetch(`http://localhost:8080/api/calculator/add?a=${firstOperand}&b=${secondOperand}`)
            .then(response => response.text())
            .then(result => { 
                display.value = result;
                return result;
             });
    }
    if (currentOperation === '*') {
        fetch(`http://localhost:8080/api/calculator/multiply?a=${firstOperand}&b=${secondOperand}`)
            .then(response => response.text())
            .then(result => { 
                display.value = result;
                return result;
             });
    }
    if (currentOperation === '/') {
        fetch(`http://localhost:8080/api/calculator/devide?a=${firstOperand}&b=${secondOperand}`)
            .then(response => response.text())
            .then(result => { 
                display.value = result;
                return result;
             });
    }
    if (currentOperation === 'tang') {
        fetch(`http://localhost:8080/api/calculator/tang?a=${firstOperand}`)
            .then(response => response.text())
            .then(result => { 
                display.value = result;
                return result;
             });
    }
    return Promise.resolve();
}
function reciprocal() {
    const display = document.getElementById('display');
    const currentValue = parseFloat(display.value);
    if (currentValue !== 0) {
        display.value = 1 / currentValue;
    } else {
        display.value = "Error"; // Fehler bei Division durch 0
    }
}

module.exports = { appendNumber, setOperation, calculate };
