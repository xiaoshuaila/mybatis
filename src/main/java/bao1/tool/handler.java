package bao1.tool;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import bao1.tool.*;
public class handler implements InvocationHandler {
    Object targer;

    public handler(Object targer) {
        this.targer = targer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj=null;
        System.out.println("执行");
        SqlSession sqlSession=null;
        try{
            sqlSession=sqlsessiontool.getsqlsession();
            obj=method.invoke(targer,args);
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return obj;
    }
    public Object getprox(){
        return Proxy.newProxyInstance(targer.getClass().getClassLoader(),
                targer.getClass().getInterfaces(),
                this);
    }
}
