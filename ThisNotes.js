const teacher={
    name: 'Jimmy',
    sayName: function(){
        console.log(this.name);
    }
}

teacher.sayName();

//The four scopes of ‘this’

/*- implicit
    - ex: myObj.func( );
          - refers to myObj

- explicit
    - ex: func.bind(myObj)( )
           - refers to myObj

- new
     - ex: var car = new func({ })
	- ‘this’ is inside the function

- global
     - ex: func( )*/

     function sayName(){
         console.log(this.name);
     }

     const teacher1={
         name: 'Jimmy',
         speak: sayName
     }

     const teacher2={
         name: 'Chris',
         speak: sayName
     }

     teacher1.speak();
     teacher2.speak();