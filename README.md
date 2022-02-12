# springboot-project-scaffold

SpringBoot项目脚手架，快速完成一个WEB项目的初始化工作。

## 项目结构及其依赖

```bash
.
├── README.md
├── pom.xml  # 父pom
├── scaffold-sdk
├── scaffold-common
├── scaffold-domain
├── scaffold-dao（scaffold-domain）
├── scaffold-service(scaffold-common、scaffold-dao)
├── scaffold-task（scaffold-service）
├── scaffold-open-api（scaffold-task）
├── scaffold-api（scaffold-task）

```

## 项目版本控制

### 初始胡项目

```
git init 

git config pull.rebase false

git remote add origin git@github.com:common-project-scaffold/springboot-project-scaffold.git

git pull
```

### 提交代码
```markdown
git status 

git add .

git commit -m 'fix'

git push origin main
```


## 项目管理


```markdown
cd springboot-project-scaffold

# 需要先将父pom安装到本地maven仓库，放置子模块间存在相互依赖报错
mvn clean install
```

## 代码格式化

`formatter-maven-plugin`

```bash
mvn clean package
```

### 配置说明
```bash
comment.format_javadoc_comments（TRUE, FALSE）：用于控制javadoc注释是否被格式化，默认为TRUE；
```
参考文档：[格式化模板（Formatter）配置详解](https://blog.csdn.net/u010904188/article/details/81204738)


## 静态代码风格检测

`maven-checkstyle-plugin`


```bash
mvn checkstyle:check

mvn checkstyle:checkstyle
```


## 项目初始化


```bash
sh init.sh
```


## swagger

```http request
http://localhost:8080/swagger-ui.html
```