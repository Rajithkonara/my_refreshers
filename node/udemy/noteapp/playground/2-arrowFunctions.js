// const square = function(x) {
//     return x * x;
// }

//arrow function
// const arrowSquare = (x) => {
//     return x * x;
// }

// //short hand 
// const square = (x) => x * x;

// console.log(square(2));

const event = {
    name: 'B day Party',
    guestList: ['konara', 'nimal', 'kamal'],
    printpationList() {
        console.log('Guest list 4 ' + this.name);

        this.guestList.forEach((guest) => {
            console.log(guest + 'is attending ' + this.name);
        });

    }
}

event.printpationList()