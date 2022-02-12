#!/bin/bash

cp pre-commit .git/hooks/pre-commit

chmod 700 .git/hooks/*
echo 'pre-commit钩子初始化完成'

exit 0
