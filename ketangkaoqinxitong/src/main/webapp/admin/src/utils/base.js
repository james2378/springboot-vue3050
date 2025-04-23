const base = {
    get() {
        return {
            url : "http://localhost:8080/ketangkaoqinxitong/",
            name: "ketangkaoqinxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ketangkaoqinxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校学生课堂考勤系统"
        } 
    }
}
export default base
