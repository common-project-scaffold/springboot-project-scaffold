# springboot-project-scaffold




```
.
├── README.md
├── pom.xml
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

