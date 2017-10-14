package commands

import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

class hello {

    // 使用@Usage注解解释该命令的通途
    @Usage("Say Hello")
    // 使用@Command注解当前是一个CRaSH命令
    @Command
    def main(InvocationContext context){
        // 获得SpringBoot的版本，注意groovy的方法和变量声明关键字为def
        def bootVersion = context.attributes['spring.boot.version'];
        // 获得Spring框架的版本
        def springVersion = context.attributes['spring.version'];
        // 返回命令执行结果
        return "Hello,your Spring Boot Version is "+bootVersion+",your Spring Framework Version is "+springVersion
    }

}
