package interfaces;

public interface TemplateMax<TgtType extends Comparable<TgtType>>
{
	TgtType apply(TgtType firstNum, TgtType secondNum, TgtType thirdNum);
}
