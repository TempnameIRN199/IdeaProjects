package interfaces;

public interface TemplateMin<TgtType extends Comparable<TgtType>>
{
	TgtType apply(TgtType firstNum, TgtType secondNum, TgtType thirdNum);
}
