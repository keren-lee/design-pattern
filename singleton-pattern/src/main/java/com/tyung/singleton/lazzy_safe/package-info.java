
/**
 * 懒汉式，线程安全
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @author LiYong
 *
 */
package com.tyung.singleton.lazzy_safe;