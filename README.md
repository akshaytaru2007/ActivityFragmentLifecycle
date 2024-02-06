##### Adding Fragments one with No addToBackStack call

###### Added fragment A:
```
Common_Tag: onCreate:
Common_Tag: onStart:
Common_Tag: onResume:
Common_Tag: FirstFragment onAttach:
Common_Tag: FirstFragment onCreate:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: FirstFragment onResume:
```

###### Back Button:
```
Common_Tag: FirstFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: onStop:
```

##### Adding Fragments one with addToBackStack call
```
Common_Tag: onCreate:
Common_Tag: onStart:
Common_Tag: onResume:
Common_Tag: FirstFragment onAttach:
Common_Tag: FirstFragment onCreate:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: FirstFragment onResume:
```

###### Back Button:
```
Common_Tag: FirstFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: FirstFragment onDestroyView:
Common_Tag: FirstFragment onDestroy:
Common_Tag: FirstFragment onDetach:
```

##### Adding Fragments one with No addToBackStack call
```
Common_Tag: onCreate:
Common_Tag: onStart:
Common_Tag: onResume:
Common_Tag: FirstFragment onAttach:
Common_Tag: FirstFragment onCreate:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: FirstFragment onResume:
```

###### Added Fragment 2 with No addToBackStack call
```
Common_Tag: SecondFragment onAttach:
Common_Tag: SecondFragment onCreate:
Common_Tag: SecondFragment onCreateView:
Common_Tag: SecondFragment onViewCreated:
Common_Tag: SecondFragment onStart:
Common_Tag: SecondFragment onResume:
```

###### Back Button:
```
Common_Tag: FirstFragment onPause:
Common_Tag: SecondFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: SecondFragment onStop:
Common_Tag: onStop:
```

##### Adding Fragments one with addToBackStack call
```
Common_Tag: onCreate:
Common_Tag: onStart:
Common_Tag: onResume:
Common_Tag: FirstFragment onAttach:
Common_Tag: FirstFragment onCreate:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: FirstFragment onResume:
```

###### Added Fragment 2 with addToBackStack call

```
Common_Tag: SecondFragment onAttach:
Common_Tag: SecondFragment onCreate:
Common_Tag: SecondFragment onCreateView:
Common_Tag: SecondFragment onViewCreated:
Common_Tag: SecondFragment onStart:
Common_Tag: SecondFragment onResume:
```

###### Back Button:
```
Common_Tag: SecondFragment onPause:
Common_Tag: SecondFragment onStop:
Common_Tag: SecondFragment onDestroy:
Common_Tag: SecondFragment onDetach:
```

###### Again Back Button
```
Common_Tag: FirstFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: FirstFragment onDestroyView:
Common_Tag: FirstFragment onDestroy:
Common_Tag: FirstFragment onDetach:
```

##### Adding Fragments one with addToBackStack call (using Replace)
```
Common_Tag: onCreate:
Common_Tag: onStart:
Common_Tag: onResume:
Common_Tag: FirstFragment onAttach:
Common_Tag: FirstFragment onCreate:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: FirstFragment onResume:
```

###### Back Button:
```
Common_Tag: FirstFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: FirstFragment onDestroyView:
Common_Tag: FirstFragment onDestroy:
Common_Tag: FirstFragment onDetach:
```
##### Adding two fragments with add to backstack call (using replace):
```
Common_Tag: onCreate:
Common_Tag: onStart:
Common_Tag: onResume:
Common_Tag: FirstFragment onAttach:
Common_Tag: FirstFragment onCreate:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: FirstFragment onResume:
```

###### Second Fragment

```
Common_Tag: FirstFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: SecondFragment onAttach:
Common_Tag: SecondFragment onCreate:
Common_Tag: SecondFragment onCreateView:
Common_Tag: SecondFragment onViewCreated:
Common_Tag: SecondFragment onStart:
Common_Tag: FirstFragment onDestroyView:
Common_Tag: SecondFragment onResume:
```

###### Back Button from second fragment:

```
Common_Tag: SecondFragment onPause:
Common_Tag: SecondFragment onStop:
Common_Tag: FirstFragment onCreateView:
Common_Tag: FirstFragment onViewCreated:
Common_Tag: FirstFragment onStart:
Common_Tag: SecondFragment onDestroy:
Common_Tag: SecondFragment onDetach:
Common_Tag: FirstFragment onResume:
```

###### Back Button again:

```
Common_Tag: FirstFragment onPause:
Common_Tag: FirstFragment onStop:
Common_Tag: FirstFragment onDestroyView:
Common_Tag: FirstFragment onDestroy:
Common_Tag: FirstFragment onDetach: 
```
