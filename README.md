# bash2bash

This projects executes automatic translations from Bash scripts to PowerShell scripts, providing an alternative to manual translations from UNIX based systems commands to Windos-DOS based systems commands. Due to the complexity of Bash the scope of the translations covers: cycles, conditionals, aritmetic expressions, a few system calls and file managing, ( For further details of the scope reffer to the [grammar file](https://github.com/joacarrilloco/bash2bash/blob/master/grammar/b2b.g4) ). 
## Usage

For running this project you have to configure ANTLR4 in your editor ( we recommend IntelliJ IDEA ). For executing a translation of an specific Bash script, you can modify the [input_file](https://github.com/joacarrilloco/bash2bash/blob/master/input/input.in). Translations can also be executed through and API in toher versions of this project but this is deprecated
![alt_text](https://github.com/joacarrilloco/bash2bash/blob/master/images/api.png)


## Sample

Here is a Bash script used for encrypting some data, we are going to translate it using our tool

![alt_text](https://github.com/joacarrilloco/bash2bash/blob/master/images/bash_sample.png)

Now you can see the funtional PowerShell script as a result of the translation process

![alt_text](https://github.com/joacarrilloco/bash2bash/blob/master/images/powershell_sample.png)
