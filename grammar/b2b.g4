grammar b2b;

root: command+ EOF;

command: 'ls' | 'cat' | ' ';