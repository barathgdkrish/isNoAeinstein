Source files have same names as the classes IF THE CLASS IS PUBLIC

Classes - Fields (Variables), Methods

"New" keyword is used to create an object for the class

Class Flight {}

Flight Flight1 = New Flight()

Flight1 is merely a reference to the object.

Flight2=Flight1;

Now Flight1 and Flight2 references to the same object.


ENCAPSULATION & ACCESS MODIFIERS

Encapsulation allows to hide variables of the object, and it is achieved thru access modifiers

Default access: Private
Private: only within class
Public: can be used everywhere

NAMING CLASS : public Flight createNewWithBoth(Flight f2)

Pascal case: class BankAccount{..}

Return type: use void when no values are returned
Body: Encase within curly braces
Parameter list: CAN BE empty, can have only return types on declaration

Methods exits:

	- End of the method is reached
	- Return statement encountered (Not necessary for void)
	- Errors & exceptions
	- Can return nothing or ONLY ONE value (depending on return type)

This & null - 

This - Allows object to pass itself as an parameter.

Null - Represents uncreated objects  and can be assigned to any reference variable

Example program Snippet
