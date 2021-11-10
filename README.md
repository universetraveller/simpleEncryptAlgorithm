# simpleEncryptAlgorithm
A try of designing a encryption algorithm
# Profile
The tiny project is a trial to design encryption algorithm and try to decrypt based on password
For it is a test project,it includes some bugs
May try to debug and update sometime
# Run the project
Recommand to run the sourcecode from IDE such as IDEA.
The files include two .bat files and .jar files:
.bat files are quickpass to run the .jar and .jar is the build-file of the code
The decrypt.bat file has some bugs when it runs in cmd, so it is better to run in the IDE.
# Log
--version 1--
The principle is using arrays to calculate the unicode of a char and reforming it based on arithmetic operations.

The input and the password are both saved in arrays, and for the need of encryption, the calculation of arrays will be "inverted order".

Need to fix or update
In the unicode there are some numbers attached to null, we should avoid to get it, for that, the based calculation is add 169 to avoid getting null value.

It has some drawbacks, such as the result of encryption will not include characters, and appear some odd sign.

Then the code must be UTF-8, but cmd can't support two code in the same time, so it could not support some chinese characters.

Cmd also can not support some characters based on its original font, and will get bad result.

The password is independent to the information, so it is better to only include characters and numbers,and the next version will try to realize it.(restrict the unicode number by improve algorithm)

The existing version also has very little possibility to get mistake.

It could support chinese in IDE and characters and numbers in all platform, but I had not tried to test the punctuation(May be it can support it).
