import com.madmous.deezee.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_userindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(7)
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('sortableColumn','g',28,['property':("username"),'title':(message(code: 'user.username.label', default: 'Username'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',29,['property':("password"),'title':(message(code: 'user.password.label', default: 'Password'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',30,['property':("accountExpired"),'title':(message(code: 'user.accountExpired.label', default: 'Account Expired'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("accountLocked"),'title':(message(code: 'user.accountLocked.label', default: 'Account Locked'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',32,['property':("enabled"),'title':(message(code: 'user.enabled.label', default: 'Enabled'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',33,['property':("passwordExpired"),'title':(message(code: 'user.passwordExpired.label', default: 'Password Expired'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( userInstance in (userInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: userInstance, field: "username"))
})
invokeTag('link','g',40,['action':("show"),'id':(userInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: userInstance, field: "password"))
printHtmlPart(18)
invokeTag('formatBoolean','g',42,['boolean':(userInstance.accountExpired)],-1)
printHtmlPart(18)
invokeTag('formatBoolean','g',43,['boolean':(userInstance.accountLocked)],-1)
printHtmlPart(18)
invokeTag('formatBoolean','g',44,['boolean':(userInstance.enabled)],-1)
printHtmlPart(18)
invokeTag('formatBoolean','g',45,['boolean':(userInstance.passwordExpired)],-1)
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',51,['total':(userInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453562380000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
