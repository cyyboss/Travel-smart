const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot073x3/",
            name: "springboot073x3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot073x3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "畅游智选"
        }
    }
}
export default base
